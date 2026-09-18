package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ul extends vu0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ bo c;

    public ul(bo boVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = boVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.c.q((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
