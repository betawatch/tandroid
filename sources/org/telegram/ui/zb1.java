package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zb1 extends bu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ac1 b;

    public zb1(ac1 ac1Var, MediaController.PhotoEntry photoEntry) {
        this.b = ac1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        mc1 mc1Var = this.b.a;
        MediaController.PhotoEntry photoEntry = this.a;
        if (photoEntry.imagePath != null) {
            File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            mc1Var.B1 = new vh1(file2, file2, "");
            mc1Var.C1 = loadBitmap;
            mc1Var.b2 = 0;
            mc1Var.x0.requestLayout();
            mc1Var.b1(false);
            mc1Var.w1 = null;
            mc1Var.i1();
        }
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean z() {
        return false;
    }
}
