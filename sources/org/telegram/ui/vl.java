package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class vl extends su0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ co c;

    public vl(co coVar, ArrayList arrayList, boolean[] zArr) {
        this.c = coVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.eb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
