// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wgc {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public wgc(int i, Class cls, int i2, int i3, byte b) {
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
                    dhc.f(view, ((Boolean) obj).booleanValue());
                    break;
                case 1:
                    dhc.e(view, (CharSequence) obj);
                    break;
                default:
                    dhc.d(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.a;
        if (i2 >= b2) {
            switch (b) {
                case 0:
                    tag = Boolean.valueOf(dhc.c(view));
                    break;
                case 1:
                    tag = dhc.a(view);
                    break;
                default:
                    tag = Boolean.valueOf(dhc.b(view));
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
            View.AccessibilityDelegate e = ihc.e(view);
            r4 r4Var = e != null ? e instanceof q4 ? ((q4) e).a : new r4(e) : null;
            if (r4Var == null) {
                r4Var = new r4();
            }
            ihc.l(view, r4Var);
            view.setTag(i3, obj);
            ihc.h(this.d, view);
        }
    }
}
