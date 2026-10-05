package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zs0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public zs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new nl0(this, 16)).setDuration(150L).start();
        }
    }
}
