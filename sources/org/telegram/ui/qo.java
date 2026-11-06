package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
