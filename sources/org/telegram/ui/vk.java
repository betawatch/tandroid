package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vk extends org.telegram.ui.Components.pk0 {
    public final /* synthetic */ bo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(bo boVar, vj vjVar, yj yjVar) {
        super(vjVar, yjVar);
        this.l = boVar;
    }

    public final void f(int i10) {
        if (this.l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
