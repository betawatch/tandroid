// default package

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ri7 extends vy5 implements pr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ ui7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri7(ui7 ui7Var, byte b) {
        super(0);
        this.b = b;
        this.c = ui7Var;
    }

    @Override // pr4
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte b = this.b;
        ui7 ui7Var = this.c;
        switch (b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                File file = new File(ui7Var.b.getAbsolutePath() + ui7Var.e);
                ui7.f(file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = hda.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (nativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        hda hdaVar = new hda(nativeCreateSharedCounter);
                        parcelFileDescriptor.close();
                        return hdaVar;
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = null;
                }
            default:
                File file2 = new File(ui7Var.b.getAbsolutePath() + ui7Var.d);
                ui7.f(file2);
                return file2;
        }
    }
}
