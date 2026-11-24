// default package

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ow2 implements nw2, qw2 {
    public static ow2 g;
    public final /* synthetic */ byte a = 0;
    public Object b;
    public byte c;
    public boolean d;
    public Object e;
    public Object f;

    public ow2(ow2 ow2Var) {
        ClipData clipData = (ClipData) ow2Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = ow2Var.c;
        if (b < 0) {
            Locale locale = Locale.US;
            u36.j("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            u36.j("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = b;
        this.d = ow2Var.d;
        this.e = (Uri) ow2Var.e;
        this.f = (Bundle) ow2Var.f;
    }

    public static synchronized ow2 g(Context context) {
        ow2 ow2Var;
        synchronized (ow2.class) {
            ow2Var = g;
            if (ow2Var == null) {
                ow2Var = new ow2(context);
                g = ow2Var;
            }
        }
        return ow2Var;
    }

    @Override // qw2
    public final int a() {
        return this.d ? 1 : 0;
    }

    @Override // qw2
    public final ClipData b() {
        return (ClipData) this.b;
    }

    @Override // nw2
    public final rw2 build() {
        return new rw2(new ow2(this));
    }

    @Override // nw2
    public final void c(Uri uri) {
        this.e = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw2
    public final void d(int i) {
        this.d = i;
    }

    @Override // qw2
    public final ContentInfo e() {
        return null;
    }

    @Override // qw2
    public final int f() {
        return this.c;
    }

    public final int h() {
        byte b;
        synchronized (this.f) {
            b = this.c;
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            dl7 dl7Var = (dl7) it.next();
            if (dl7Var.a.get() == null) {
                copyOnWriteArrayList.remove(dl7Var);
            }
        }
        synchronized (this.f) {
            if (this.d && this.c == i) {
                return;
            }
            this.d = true;
            this.c = i;
            Iterator it2 = ((CopyOnWriteArrayList) this.e).iterator();
            while (it2.hasNext()) {
                dl7 dl7Var2 = (dl7) it2.next();
                dl7Var2.b.execute(new pg6(dl7Var2, (byte) 29));
            }
        }
    }

    @Override // nw2
    public final void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public final String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = (Uri) this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                byte b = this.c;
                sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                boolean z = this.d;
                sb.append(z ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(z ? 1 : 0));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return b10.j(sb, ((Bundle) this.f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public ow2(Context context) {
        Executor a = pe0.a();
        this.b = a;
        this.e = new CopyOnWriteArrayList();
        this.f = new Object();
        this.c = (byte) 0;
        a.execute(new bl7(this, context, (byte) 0));
    }

    public /* synthetic */ ow2() {
    }
}
