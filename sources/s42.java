// default package

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.math.BigDecimal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class s42 implements InputFilter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s42(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ne9 ne9Var = (ne9) obj;
                if (ne9Var.m2 && !ne9Var.i2) {
                    me9 me9Var = ne9Var.e2;
                    if (me9Var != null && charSequence != null && i2 > i && i3 == i4) {
                        me9Var.M(charSequence.subSequence(i, i2));
                    }
                    break;
                }
                break;
            case 2:
                a3b a3bVar = (a3b) obj;
                if (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0))) {
                    if (TextUtils.isEmpty(a3bVar.getText()) || i3 == 0) {
                    }
                }
                break;
            default:
                rrc rrcVar = (rrc) obj;
                String str = spanned.subSequence(0, i3).toString() + ((Object) charSequence.subSequence(i, i2)) + ((Object) spanned.subSequence(i4, spanned.length()));
                int i5 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                if (rrcVar.l0) {
                    BigDecimal j0 = rrcVar.j0();
                    valueOf = valueOf.multiply(j0);
                    i5 = rrc.i0(j0);
                }
                int max = Math.max(str.indexOf(46), str.indexOf(44));
                if (max < 0 || (str.length() - max) - 1 <= i5) {
                    if (rrc.u0(str).compareTo(valueOf) > 0) {
                        break;
                    } else if (i != i2) {
                        boolean z = false;
                        for (int i6 = 0; i6 < str.length(); i6++) {
                            char charAt = str.charAt(i6);
                            if (charAt == '.' || charAt == ',') {
                                if (z) {
                                    break;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        if (i3 != 0 || (!str.startsWith(".") && !str.startsWith(","))) {
                            if (str.startsWith("00")) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
                break;
        }
        return spanned.subSequence(i3, i4);
    }
}
