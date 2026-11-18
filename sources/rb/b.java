package rb;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.android.gms.common.api.n;
import java.io.Closeable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface b extends Closeable, s, n {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    void close();
}
