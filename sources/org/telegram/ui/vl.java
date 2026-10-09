package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vl extends uu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ zn c;

    public vl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.c = znVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.ib(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
