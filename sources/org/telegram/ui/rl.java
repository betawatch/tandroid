package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rl extends fu0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ xn c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = xnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.c.r((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z4, i11, 0, z10, 0L);
    }
}
