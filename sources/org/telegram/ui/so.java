package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;
    public final /* synthetic */ String c;

    public /* synthetic */ so(to toVar, String str, int i7) {
        this.a = i7;
        this.b = toVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                to toVar = this.b;
                String str = this.c;
                toVar.getClass();
                org.telegram.messenger.g0.h3(new so(toVar, str, 1));
                break;
            default:
                to toVar2 = this.b;
                String str2 = this.c;
                toVar2.f = null;
                Utilities.g.c(new o1(toVar2, str2, new ArrayList(toVar2.h.w), 28));
                break;
        }
    }
}
