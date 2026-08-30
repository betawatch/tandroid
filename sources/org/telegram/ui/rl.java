package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rl extends yt0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ xn c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = xnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.c.r((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z4, i11, 0, z10, 0L);
    }
}
