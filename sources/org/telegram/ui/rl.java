package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rl extends ou0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ yn c;

    public rl(yn ynVar, ArrayList arrayList, boolean[] zArr) {
        this.c = ynVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.db(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
