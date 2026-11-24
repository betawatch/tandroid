// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s32 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ r32(s32 s32Var, String str, int i, byte b) {
        this.a = b;
        this.b = s32Var;
        this.c = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s32 s32Var = this.b;
                String str = this.c;
                int i = this.d;
                s32Var.getClass();
                gm.c3(new r32(s32Var, str, i, (byte) 1));
                break;
            default:
                s32 s32Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                s32Var2.getClass();
                int i3 = z8c.t0;
                Utilities.g.c(new h01(s32Var2, str2, new ArrayList(bw2.r(i3).Z.values()), new ArrayList(bw2.r(i3).f0), i3, i2));
                break;
        }
    }
}
