// default package

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yi7 extends az5 implements sr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ bj7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi7(bj7 bj7Var, byte b) {
        super(0);
        this.b = b;
        this.c = bj7Var;
    }

    @Override // sr4
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte b = this.b;
        bj7 bj7Var = this.c;
        switch (b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                File file = new File(bj7Var.b.getAbsolutePath() + bj7Var.e);
                bj7.f(file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = yea.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (nativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        yea yeaVar = new yea(nativeCreateSharedCounter);
                        parcelFileDescriptor.close();
                        return yeaVar;
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
                File file2 = new File(bj7Var.b.getAbsolutePath() + bj7Var.d);
                bj7.f(file2);
                return file2;
        }
    }
}
