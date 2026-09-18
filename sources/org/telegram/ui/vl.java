package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vl extends vu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ bo c;

    public vl(bo boVar, ArrayList arrayList, boolean[] zArr) {
        this.c = boVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.eb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
