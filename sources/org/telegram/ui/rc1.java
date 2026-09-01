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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rc1 extends au0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ sc1 b;

    public rc1(sc1 sc1Var, MediaController.PhotoEntry photoEntry) {
        this.b = sc1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ed1 ed1Var = this.b.a;
        MediaController.PhotoEntry photoEntry = this.a;
        if (photoEntry.imagePath != null) {
            File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e6) {
                e6.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            ed1Var.y1 = new qi1(file2, file2, "");
            ed1Var.z1 = loadBitmap;
            ed1Var.Y1 = 0;
            ed1Var.u0.requestLayout();
            ed1Var.b1(false);
            ed1Var.t1 = null;
            ed1Var.i1();
        }
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean z() {
        return false;
    }
}
