package qi;

import java.io.File;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public interface m {
    void onBytesAvailable(long j10, File file, long j11, long j12);

    void onOutputCompleted(long j10, File file, long j11, long j12);

    void onOutputError(long j10, Exception exc);

    void onOutputInvalidated(long j10, l lVar);

    void onOutputStarted(long j10, File file);
}
