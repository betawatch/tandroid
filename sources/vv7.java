// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vv7 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public vv7(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.fingerprint);
        addView(imageView, nme.e(-1, -1, kk7.D1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(gl.o());
        textView.setTextColor(-1);
        textView.setTextSize(1, 26.0f);
        textView.setGravity(17);
        addView(textView, nme.d(-1, -2.0f, 17, 0.0f, -5.33f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 10.0f);
        textView2.setTextColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textView2.setGravity(17);
        addView(textView2, nme.d(-1, -2.0f, 17, 0.0f, 14.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public void setImage(int i) {
        ImageView imageView = this.a;
        imageView.setVisibility(0);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        imageView.setImageResource(i);
    }

    public void setNum(int i) {
        String str;
        this.a.setVisibility(8);
        TextView textView = this.b;
        textView.setVisibility(0);
        TextView textView2 = this.c;
        textView2.setVisibility(0);
        textView.setText(String.valueOf(i));
        if (i != 0) {
            switch (i) {
                case 2:
                    str = "ABC";
                    break;
                case 3:
                    str = "DEF";
                    break;
                case 4:
                    str = "GHI";
                    break;
                case 5:
                    str = "JKL";
                    break;
                case 6:
                    str = "MNO";
                    break;
                case 7:
                    str = "PQRS";
                    break;
                case 8:
                    str = "TUV";
                    break;
                case 9:
                    str = "WXYZ";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "+";
        }
        textView2.setText(str);
    }
}
