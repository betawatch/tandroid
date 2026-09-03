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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wc1 extends fu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ xc1 b;

    public wc1(xc1 xc1Var, MediaController.PhotoEntry photoEntry) {
        this.b = xc1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        jd1 jd1Var = this.b.a;
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
            jd1Var.y1 = new vi1(file2, file2, "");
            jd1Var.z1 = loadBitmap;
            jd1Var.Y1 = 0;
            jd1Var.u0.requestLayout();
            jd1Var.b1(false);
            jd1Var.t1 = null;
            jd1Var.i1();
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
