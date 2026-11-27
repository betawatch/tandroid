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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yv2 implements xv2, aw2 {
    public static yv2 g;
    public final /* synthetic */ byte a = 0;
    public Object b;
    public byte c;
    public boolean d;
    public Object e;
    public Object f;

    public yv2(yv2 yv2Var) {
        ClipData clipData = (ClipData) yv2Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = yv2Var.c;
        if (b < 0) {
            Locale locale = Locale.US;
            lq5.j("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            lq5.j("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = b;
        this.d = yv2Var.d;
        this.e = (Uri) yv2Var.e;
        this.f = (Bundle) yv2Var.f;
    }

    public static synchronized yv2 g(Context context) {
        yv2 yv2Var;
        synchronized (yv2.class) {
            yv2Var = g;
            if (yv2Var == null) {
                yv2Var = new yv2(context);
                g = yv2Var;
            }
        }
        return yv2Var;
    }

    @Override // aw2
    public final int a() {
        return this.d ? 1 : 0;
    }

    @Override // aw2
    public final ClipData b() {
        return (ClipData) this.b;
    }

    @Override // xv2
    public final bw2 build() {
        return new bw2(new yv2(this));
    }

    @Override // xv2
    public final void c(Uri uri) {
        this.e = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xv2
    public final void d(int i) {
        this.d = i;
    }

    @Override // aw2
    public final ContentInfo e() {
        return null;
    }

    @Override // aw2
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
            il7 il7Var = (il7) it.next();
            if (il7Var.a.get() == null) {
                copyOnWriteArrayList.remove(il7Var);
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
                il7 il7Var2 = (il7) it2.next();
                il7Var2.b.execute(new fe7(il7Var2, (byte) 5));
            }
        }
    }

    @Override // xv2
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
                return c00.k(sb, ((Bundle) this.f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public yv2(Context context) {
        Executor a = rd0.a();
        this.b = a;
        this.e = new CopyOnWriteArrayList();
        this.f = new Object();
        this.c = (byte) 0;
        a.execute(new t87(this, context, (byte) 26));
    }

    public /* synthetic */ yv2() {
    }
}
