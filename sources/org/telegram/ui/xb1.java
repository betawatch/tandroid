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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xb1 extends zt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ yb1 b;

    public xb1(yb1 yb1Var, MediaController.PhotoEntry photoEntry) {
        this.b = yb1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        kc1 kc1Var = this.b.a;
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
            kc1Var.B1 = new th1(file2, file2, "");
            kc1Var.C1 = loadBitmap;
            kc1Var.b2 = 0;
            kc1Var.x0.requestLayout();
            kc1Var.b1(false);
            kc1Var.w1 = null;
            kc1Var.i1();
        }
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean z() {
        return false;
    }
}
