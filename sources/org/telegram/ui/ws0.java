package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
