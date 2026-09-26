package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ws0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public ws0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new il0(this, 15)).setDuration(150L).start();
        }
    }
}
