package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rl extends au0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ xn c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = xnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.c.r((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z4, i11, 0, z10, 0L);
    }
}
