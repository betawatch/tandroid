package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zs0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public zs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.a81 a81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (a81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new zg0(24, this, a81Var));
        }
    }
}
