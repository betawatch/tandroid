// default package

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class wy0 implements hz0, ft3, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wy0(gt3 gt3Var, int i, int i2, q62 q62Var) {
        this.a = (byte) 2;
        this.b = gt3Var;
        this.c = i;
        this.d = i2;
        this.e = q62Var;
    }

    @Override // ft3
    public final void a(String str) {
        gt3 gt3Var = (gt3) this.b;
        q62 q62Var = (q62) this.e;
        Editable text = gt3Var.getText();
        int i = this.c;
        int i2 = this.d;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof gm) && !(characterStyle instanceof dy8)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i) {
                        text.setSpan(characterStyle, spanStart, i, 33);
                    }
                    if (spanEnd > i2) {
                        text.setSpan(characterStyle, i2, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(gt3Var.B(str), i, i2, 33);
        } catch (Exception unused) {
        }
        et3 et3Var = gt3Var.T1;
        if (et3Var != null) {
            et3Var.m();
        }
        if (q62Var != null) {
            q62Var.run();
        }
    }

    @Override // us2
    public final void accept(Object obj) {
        ox6 ox6Var = (ox6) this.b;
        Surface surface = (Surface) this.e;
        ad8 ad8Var = (ad8) obj;
        ((tv6) ox6Var.a.get()).getClass();
        if (surface == null) {
            ad8Var.Q(null);
            ox6Var.n = null;
        } else {
            mx6 mx6Var = new mx6(surface, this.c, this.d);
            ox6Var.n = mx6Var;
            ad8Var.Q(mx6Var);
        }
    }

    @Override // hz0
    public final void b(gz0 gz0Var) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pz0 pz0Var = (pz0) obj2;
                pz0Var.a.j(new zy0(pz0Var, this.c, obj, this.d, gz0Var, (byte) 1), 0L);
                break;
            default:
                pz0 pz0Var2 = (pz0) obj2;
                pz0Var2.a.j(new zy0(pz0Var2, this.c, obj, this.d, gz0Var, (byte) 0), 0L);
                break;
        }
    }

    public /* synthetic */ wy0(pz0 pz0Var, int i, Object obj, int i2, byte b) {
        this.a = b;
        this.b = pz0Var;
        this.c = i;
        this.e = obj;
        this.d = i2;
    }

    public /* synthetic */ wy0(ox6 ox6Var, Surface surface, int i, int i2) {
        this.a = (byte) 3;
        this.b = ox6Var;
        this.e = surface;
        this.c = i;
        this.d = i2;
    }
}
