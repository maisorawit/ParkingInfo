package buu.informatics.s59160135.parkinginfo


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_parking.*

/**
 * A simple [Fragment] subclass.
 */
class parking : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_parking, container, false)
    }

    var s = 0
    var slot1:Array<String> = arrayOf("","","")
    var slot2:Array<String> = arrayOf("","","")
    var slot3:Array<String> = arrayOf("","","")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        p1_button.setOnClickListener{
            s = 1 ;
            reset()
            carid_editText.setText(slot1[0])
            brand_editText.setText(slot1[1])
            name_editText.setText(slot1[2])
            value.visibility = View.VISIBLE

            update_button.setOnClickListener {
                if (carid_editText.text.toString().length>1){
                slot1[0] = carid_editText.text.toString()
                slot1[1] = brand_editText.text.toString()
                slot1[2] = name_editText.text.toString()
                value.visibility = View.INVISIBLE
                p1_button.setText(slot1[0])
                p1_button.setBackgroundColor(Color.parseColor("#F8B45E"))
            }
            }
            delete_button.setOnClickListener{
                reset()
                slot1[0] = carid_editText.text.toString()
                slot1[1] = brand_editText.text.toString()
                slot1[2] = name_editText.text.toString()
                value.visibility = View.INVISIBLE
                p1_button.setText("Empty")
                p1_button.setBackgroundColor(Color.parseColor("#F1E26F"))
            }
        }

        p2_button.setOnClickListener{
            s = 2 ;
            reset()
            carid_editText.setText(slot2[0])
            brand_editText.setText(slot2[1])
            name_editText.setText(slot2[2])
            value.visibility = View.VISIBLE
            update_button.setOnClickListener {
                if (carid_editText.text.toString().length>1){
                    slot2[0] = carid_editText.text.toString()
                    slot2[1] = brand_editText.text.toString()
                    slot2[2] = name_editText.text.toString()
                    value.visibility = View.INVISIBLE
                    p2_button.setText(slot2[0])
                    p2_button.setBackgroundColor(Color.parseColor("#F8B45E"))
                }
            }
            delete_button.setOnClickListener{
                reset()
                slot2[0] = carid_editText.text.toString()
                slot2[1] = brand_editText.text.toString()
                slot2[2] = name_editText.text.toString()
                value.visibility = View.INVISIBLE
                p2_button.setText("Empty")
                p2_button.setBackgroundColor(Color.parseColor("#F1E26F"))
            }
        }

        p3_button.setOnClickListener{
            s = 3 ;
            reset()
            carid_editText.setText(slot3[0])
            brand_editText.setText(slot3[1])
            name_editText.setText(slot3[2])
            value.visibility = View.VISIBLE

            update_button.setOnClickListener {
                if (carid_editText.text.toString().length>1){
                slot3[0] = carid_editText.text.toString()
                slot3[1] = brand_editText.text.toString()
                slot3[2] = name_editText.text.toString()
                value.visibility = View.INVISIBLE
                p3_button.setText(slot3[0])
                p3_button.setBackgroundColor(Color.parseColor("#F8B45E"))
            }
            }
            delete_button.setOnClickListener{
                reset()
                slot3[0] = carid_editText.text.toString()
                slot3[1] = brand_editText.text.toString()
                slot3[2] = name_editText.text.toString()
                value.visibility = View.INVISIBLE
                p3_button.setText("Empty")
                p3_button.setBackgroundColor(Color.parseColor("#F1E26F"))
            }
        }
    }

    fun reset(){
        carid_editText.text.clear()
        brand_editText.text.clear()
        name_editText.text.clear()
    }

    fun checkNull(){
        if(s == 1){
            slot1[0].equals("")
        }
    }





}
