// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class z7b implements a8b, mvc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ File b;

    public /* synthetic */ z7b(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    @Override // mvc
    public final InputStream b() {
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 3:
                if (file.exists()) {
                    break;
                }
                break;
            case 4:
                if (file.exists()) {
                    break;
                }
                break;
        }
        return new FileInputStream(file);
    }

    @Override // a8b
    public final Bitmap i(BitmapFactory.Options options) {
        byte b = this.a;
        File file = this.b;
        switch (b) {
        }
        return BitmapFactory.decodeFile(file.getPath(), options);
    }
}
