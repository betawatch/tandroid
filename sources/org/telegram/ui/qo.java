package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;
    public final /* synthetic */ String c;

    public /* synthetic */ qo(ro roVar, String str, int i7) {
        this.a = i7;
        this.b = roVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ro roVar = this.b;
                String str = this.c;
                roVar.getClass();
                org.telegram.messenger.g0.h3(new qo(roVar, str, 1));
                break;
            default:
                ro roVar2 = this.b;
                String str2 = this.c;
                roVar2.f = null;
                Utilities.g.c(new o1(roVar2, str2, new ArrayList(roVar2.h.w), 28));
                break;
        }
    }
}
