## Word Embeddings

We can think of word embedding as creating a vector for each word in an N dimensional plane (n represents the number of features with which we classify our word). 
Since each word has its own vector and points in their own direction in the n-D plane we can group similar words since their features will also be similar.

Ex. Words like hapy and joy can be said to be like each other and even if we might replace the two with one another the sentence wouldnt change drastically in its meaning. As this is the case when we vectroize the two words the angle subtended between both these vectors would not be very different and we will then be able to group the two words as similar ones. Whereas words like unhappy might share some common features (such as they are both emotions) but they wil be fundamentally different when it ocomes to their meaning as one represents a positive emotion while the other a negative emeotion this will cause their vector angles to more different from one another so we can figure out that their meanings are not the same.


## RNN (Recurrent Nueral Network)

When we say recurrent neural network all we really mean is a network that contains a loop. A RNN will process one word at a time while maintaining an internal memory of what it's already seen. This will allow it to treat words differently based on their order in a sentence and to slowly build an understanding of the entire input, one word at a time.

## BERT (Bidirectional Encoder Representations from Transformers) 2017

BERT is based on transformers which is a deep learning model in which every output is sequentially connected to every input (the next input in the series) and the weigtings between them are dynamically calculated based on their interaction (in NLP this is called **_attention_**). <br>
BERT is special in the sense that historically models were only meant to read inputs from the ledt to right but BERT as the name implies is bidirectional with the help of transformers.<br>
The use case of BERT can be said to be namely two things 


#### Masked language Modelling (MLM)

 MLM training is to hide a word in a sentence and then have the program predict what word has been hidden (masked) based on the hidden word's context


####  Next Sentence Prediction

 The objective of Next Sentence Prediction training is to have the program predict whether two given sentences have a logical, sequential connection or whether their relationship is simply random.
    
BERT is different from RNNs in the sense that instead of sequentially assesing data it uses processing any given word in relation to all other words in a sentence, rather than processing them one at a time. By looking at all surrounding words, the Transformer allows the BERT model to understand the full context of the word, and therefore better understand searcher intent.
Traditional NLP methods like **word2vec** and **GloVe** which use word embeddings can only represent a word with a single vector since each word is mapped to a single vector which represents only a sliveer of its meaning.
<br>
BERT uses [masked modelling](#masked-language-modelling-mlm) to keep the word in focus from seeing itself so that unlike in RNNs where a preweight/vector is assigned to a word the words in BERT has a fixed meaning independent of its context they are defined by their surroundings instead.
<br>
#### BERT use cases:

* Question answering
* Abstract summarization
* Sentence prediction
* Conversational response generation
* Polysemy and Coreference (words that sound or look the same but have different meanings) resolution
* Word sense disambiguation
* Natural language inference
* Sentiment classification



