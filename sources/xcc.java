// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xcc {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public xcc(int i, Class cls, int i2, int i3, byte b) {
        this.e = b;
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r0 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r2 = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r0 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Object obj) {
        Object tag;
        boolean z;
        boolean z2;
        boolean z3;
        int i = Build.VERSION.SDK_INT;
        byte b = this.e;
        byte b2 = this.c;
        if (i >= b2) {
            switch (b) {
                case 0:
                    edc.f(view, ((Boolean) obj).booleanValue());
                    break;
                case 1:
                    edc.e(view, (CharSequence) obj);
                    break;
                default:
                    edc.d(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.a;
        if (i2 >= b2) {
            switch (b) {
                case 0:
                    tag = Boolean.valueOf(edc.c(view));
                    break;
                case 1:
                    tag = edc.a(view);
                    break;
                default:
                    tag = Boolean.valueOf(edc.b(view));
                    break;
            }
        } else {
            tag = view.getTag(i3);
            if (!this.b.isInstance(tag)) {
                tag = null;
            }
        }
        boolean z4 = false;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) tag;
                Boolean bool2 = (Boolean) obj;
                boolean z5 = bool != null && bool.booleanValue();
                if (bool2 != null && bool2.booleanValue()) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
                break;
            case 1:
                z2 = !TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                break;
            default:
                Boolean bool3 = (Boolean) tag;
                Boolean bool4 = (Boolean) obj;
                boolean z6 = bool3 != null && bool3.booleanValue();
                if (bool4 != null && bool4.booleanValue()) {
                    z3 = true;
                    break;
                } else {
                    z3 = false;
                    break;
                }
        }
        if (z2) {
            View.AccessibilityDelegate e = jdc.e(view);
            q4 q4Var = e != null ? e instanceof p4 ? ((p4) e).a : new q4(e) : null;
            if (q4Var == null) {
                q4Var = new q4();
            }
            jdc.k(view, q4Var);
            view.setTag(i3, obj);
            jdc.g(this.d, view);
        }
    }
}
