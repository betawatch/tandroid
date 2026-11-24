// default package

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p06 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i) {
        setLayoutParams(new ViewGroup.LayoutParams(gl.L(54.0f), i));
    }

    public void setLetter(String str) {
        this.a.setText(str.toUpperCase());
    }

    public void setLetterProgress(float f) {
        TextView textView = this.a;
        textView.setAlpha(f);
        float f2 = (0.4f * f) + 0.6f;
        textView.setScaleX(f2);
        textView.setScaleY(f2);
        textView.setTranslationX((1.0f - f) * (-gl.L(10.0f)));
    }

    public void setLetterTextSize(float f) {
        this.a.setTextSize(1, f);
    }
}
