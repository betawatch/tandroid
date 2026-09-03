package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tk extends c2.z {
    public final /* synthetic */ zn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(zn znVar, sj sjVar, vj vjVar) {
        super(sjVar, vjVar);
        this.l = znVar;
    }

    public final void d(int i10) {
        if (this.l.Ma) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
