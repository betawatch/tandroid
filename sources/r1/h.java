package r1;

import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j10, int i10) {
        return Os.lseek(fileDescriptor, j10, i10);
    }
}
