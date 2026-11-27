// default package

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pf5 extends y1 {
    public final /* synthetic */ byte a;
    public final hk0 b;
    public final Serializable c;

    public pf5() {
        this.a = (byte) 1;
        this.b = new kp5();
        this.c = new ArrayList();
    }

    @Override // y1
    public final void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[LOOP:2: B:19:0x003b->B:21:0x003f, LOOP_END] */
    @Override // y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i;
        int i2;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char charAt = charSequence.charAt(i2);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((kp5) this.b).g = sb.toString();
                    break;
                } while (i2 == -1);
                StringBuilder sb2 = new StringBuilder();
                while (i < size + 1) {
                }
                ((kp5) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // y1
    public final hk0 e() {
        byte b = this.a;
        hk0 hk0Var = this.b;
        switch (b) {
            case 0:
                return (of5) hk0Var;
            default:
                return (kp5) hk0Var;
        }
    }

    @Override // y1
    public final void g(tp5 tp5Var) {
        switch (this.a) {
            case 0:
                tp5Var.a((String) this.c, (of5) this.b);
                break;
        }
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (mp3Var.g >= 4) {
                    return new qk2(-1, mp3Var.c + 4, false);
                }
                if (mp3Var.h) {
                    return qk2.a(mp3Var.e);
                }
                return null;
        }
    }

    public pf5(int i, String str) {
        this.a = (byte) 0;
        of5 of5Var = new of5();
        this.b = of5Var;
        of5Var.g = i;
        this.c = str;
    }
}
