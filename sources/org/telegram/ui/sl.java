package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sl extends au0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ xn c;

    public sl(xn xnVar, ArrayList arrayList, boolean[] zArr) {
        this.c = xnVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.eb(arrayList, i11, z4, z10);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
