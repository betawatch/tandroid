// default package

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xi7 extends az5 implements sr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ aj7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi7(aj7 aj7Var, byte b) {
        super(0);
        this.b = b;
        this.c = aj7Var;
    }

    @Override // sr4
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte b = this.b;
        aj7 aj7Var = this.c;
        switch (b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                File file = new File(aj7Var.b.getAbsolutePath() + aj7Var.e);
                aj7.f(file);
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
                File file2 = new File(aj7Var.b.getAbsolutePath() + aj7Var.d);
                aj7.f(file2);
                return file2;
        }
    }
}
