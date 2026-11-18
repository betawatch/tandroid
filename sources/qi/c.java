package qi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        int i10 = this.a & ks.e4;
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
                i7 = n6.zl;
                break;
            case 2:
                i7 = n6.Al;
                break;
            case 3:
                i7 = n6.Bl;
                break;
            case 4:
                i7 = n6.Cl;
                break;
            case 5:
                i7 = n6.Dl;
                break;
            case 6:
                i7 = n6.El;
                break;
            case 7:
                i7 = n6.Fl;
                break;
            default:
                i7 = -1;
                break;
        }
        if (i7 >= 0) {
            textPaint.setColor(n6.x0(null, i7, false));
        }
    }
}
