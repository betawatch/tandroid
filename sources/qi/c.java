package qi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class c extends CharacterStyle {
    public final int a;

    public c(int i7) {
        this.a = i7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        HashMap hashMap = q.b;
        int i10 = this.a & ns.e4;
        switch (i10) {
            case 8:
            case 18:
                i10 = 1;
                break;
            case 9:
            case 10:
            case 14:
            case 15:
                i10 = 3;
                break;
            case 11:
            case 13:
                i10 = 7;
                break;
            case 12:
            case 16:
            case 17:
            case 19:
                i10 = 4;
                break;
            case 20:
                i10 = 6;
                break;
            case 21:
                i10 = 2;
                break;
        }
        switch (i10) {
            case 1:
                i7 = j6.zl;
                break;
            case 2:
                i7 = j6.Al;
                break;
            case 3:
                i7 = j6.Bl;
                break;
            case 4:
                i7 = j6.Cl;
                break;
            case 5:
                i7 = j6.Dl;
                break;
            case 6:
                i7 = j6.El;
                break;
            case 7:
                i7 = j6.Fl;
                break;
            default:
                i7 = -1;
                break;
        }
        if (i7 >= 0) {
            textPaint.setColor(j6.x0(null, i7, false));
        }
    }
}
