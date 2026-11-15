package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ u9(int i7) {
        this.a = i7;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        switch (this.a) {
            case 0:
                d1.f.b.decrementAndGet();
                break;
            case 1:
                d1.f.b.decrementAndGet();
                break;
            case 2:
                d1.f.b.decrementAndGet();
                break;
            case 3:
                d1.f.b.decrementAndGet();
                break;
            default:
                d1.f.b.decrementAndGet();
                break;
        }
    }
}
