package ri;

import java.io.File;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public interface l {
    void onBytesAvailable(long j10, File file, long j11, long j12);

    void onOutputCompleted(long j10, File file, long j11, long j12);

    void onOutputError(long j10, Exception exc);

    void onOutputInvalidated(long j10, k kVar);

    void onOutputStarted(long j10, File file);
}
