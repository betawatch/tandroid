package xe;

import android.content.Context;
import h7.u;
import java.io.EOFException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b implements a3.b {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    public byte a() {
        int read = ((com.google.firebase.messaging.d) this.a).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int b() {
        return ((a() & 255) << 24) | ((a() & 255) << 16) | ((a() & 255) << 8) | (a() & 255);
    }

    public int c() {
        return ((a() & Byte.MAX_VALUE) << 21) | ((a() & Byte.MAX_VALUE) << 14) | ((a() & Byte.MAX_VALUE) << 7) | (a() & Byte.MAX_VALUE);
    }

    public void d(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.a).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // rc.a
    public Object get() {
        return new s5.m((Context) ((a3.c) this.a).a, new u(7), new db.a(7), 13);
    }
}
