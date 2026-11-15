package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wj extends org.telegram.ui.Components.wi0 {
    public final /* synthetic */ an l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(an anVar, aj ajVar, dj djVar) {
        super(ajVar, djVar);
        this.l = anVar;
    }

    public final void f(int i7) {
        if (this.l.mb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.b = i7;
    }
}
