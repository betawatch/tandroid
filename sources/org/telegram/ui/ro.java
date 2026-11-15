package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ so b;
    public final /* synthetic */ String c;

    public /* synthetic */ ro(so soVar, String str, int i7) {
        this.a = i7;
        this.b = soVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                so soVar = this.b;
                String str = this.c;
                soVar.getClass();
                org.telegram.messenger.g0.h3(new ro(soVar, str, 1));
                break;
            default:
                so soVar2 = this.b;
                String str2 = this.c;
                soVar2.f = null;
                Utilities.g.c(new o1(soVar2, str2, new ArrayList(soVar2.h.w), 28));
                break;
        }
    }
}
