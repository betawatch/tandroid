package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ql extends tu0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ zn c;

    public ql(zn znVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = znVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.c.q((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
