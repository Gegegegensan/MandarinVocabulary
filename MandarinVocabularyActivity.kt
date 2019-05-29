package works.ryo.app.mandarinvocabulary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MandarinVocabularyActivity : AppCompatActivity() {
    private val vocabBook = VocabBook()
    //　Declare our View variables
    private var vocabularyTextView: TextView? = null
    private var nextButton: Button? = null
    // private var relativeLayout: RelativeLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mandarin_vocabulary)

        // Assign the Views from the layout file to the corresponding variables
        vocabularyTextView = findViewById<TextView>(R.id.vocabularyTextView) as TextView
        nextButton = findViewById<Button>(R.id.nextButton) as Button
        // relativeLayout = findViewById<RelativeLayout>(R.id.relativeLayout) as RelativeLayout //Change
        nextButton!!.setOnClickListener {
            val vocab = vocabBook.getVocab()

            // Update the screen with out new vocab
            vocabularyTextView!!.text = vocab
            // relativeLayout!!.setBackgroundColor(Color.RED) //Change
        }


    }
}
