package s7;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.z;
import h7.l7;
import java.util.ArrayList;
import java.util.LinkedList;
import y5.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j {
    public j9.a a;
    public Bundle b;
    public LinkedList c;
    public final d e;
    public final Context f;
    public ae.b g;
    public final ae.b d = new ae.b(this, 18);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f = context;
    }

    public static void a(d dVar) {
        v5.d dVar2 = v5.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, v5.e.a);
        String c10 = q.c(context, d);
        String b10 = q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = dVar2.b(context, null, d);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new z(context, b11));
        }
    }

    public final void b(int i10) {
        while (!this.c.isEmpty() && ((i6.e) this.c.getLast()).a() >= i10) {
            this.c.removeLast();
        }
    }

    public final void c(Bundle bundle, i6.e eVar) {
        if (this.a != null) {
            eVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f;
        if (this.a == null) {
            try {
                synchronized (e.class) {
                    e.a(context);
                }
                t7.g V0 = l7.a(context).V0(new i6.b(context));
                if (V0 == null) {
                    return;
                }
                this.g.X(new j9.a(this.e, V0));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.a.B((f) obj);
                }
                arrayList.clear();
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            } catch (v5.f unused) {
            }
        }
    }
}
