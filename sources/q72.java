// default package

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q72 extends LinearLayout {
    public final wjb a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q72(Activity activity, View view, int i, wjb wjbVar) {
        super(activity);
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = wjbVar;
        int L = gl.L(18.0f);
        Paint d = wjbVar != null ? wjbVar.d("paintChatActionBackground") : null;
        d = d == null ? bkb.T0("paintChatActionBackground") : d;
        int i4 = bkb.a;
        setBackground(new qjb(this, view, L, d));
        setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
        setOrientation(1);
        if (i == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            zkb.X(textView, bkb.Yc, wjbVar);
            textView.setGravity(1);
            textView.setMaxWidth(gl.L(210.0f));
            arrayList.add(textView);
            addView(textView, nme.r(-2, -2, 49));
        } else if (i == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            zkb.X(textView2, bkb.Yc, wjbVar);
            textView2.setGravity(1);
            textView2.setMaxWidth(gl.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, nme.r(-2, -2, 49));
        } else {
            ry8 ry8Var = new ry8(activity);
            ry8Var.setAutoRepeat(true);
            ry8Var.f(R.raw.utyan_saved_messages, 120, 120, null);
            ry8Var.d();
            addView(ry8Var, nme.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i == 0) {
            i2 = 2131751123;
        } else {
            if (i != 1) {
                textView3.setText(k96.M0(2131752171, null));
                textView3.setTextSize(1, 16.0f);
                textView3.setTypeface(gl.o());
                textView3.setGravity(1);
                zkb.X(textView3, bkb.Yc, wjbVar);
                arrayList.add(textView3);
                float f = 260.0f;
                textView3.setMaxWidth(gl.L(260.0f));
                addView(textView3, nme.t(-2, -2, (i == 2 ? k96.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i == 2 ? 0 : 8));
                i3 = 0;
                while (i3 < 4) {
                    LinearLayout m = ir2.m(activity, 0);
                    addView(m, nme.t(-2, -2, k96.a0 ? 5 : 3, 0, 8, 0, 0));
                    ImageView imageView = new ImageView(activity);
                    float f2 = f;
                    int i5 = bkb.Yc;
                    zkb.s(imageView, i5, wjbVar, PorterDuff.Mode.MULTIPLY);
                    if (i == 0) {
                        imageView.setImageResource(R.drawable.ic_lock_white);
                    } else if (i == 2) {
                        imageView.setImageResource(R.drawable.list_circle);
                    } else {
                        imageView.setImageResource(R.drawable.groups_overview_check);
                    }
                    this.d.add(imageView);
                    TextView textView4 = new TextView(activity);
                    textView4.setTextSize(1, 15.0f);
                    zkb.X(textView4, i5, wjbVar);
                    this.c.add(textView4);
                    textView4.setGravity((k96.a0 ? 5 : 3) | 16);
                    textView4.setMaxWidth(gl.L(f2));
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    if (i == 0) {
                                        textView4.setText(k96.M0(2131751124, null));
                                    } else if (i == 2) {
                                        textView4.setText(k96.M0(2131752173, null));
                                    } else {
                                        textView4.setText(k96.M0(2131749253, null));
                                    }
                                }
                            } else if (i == 0) {
                                textView4.setText(k96.M0(2131751125, null));
                            } else if (i == 2) {
                                textView4.setText(k96.M0(2131752174, null));
                            } else {
                                textView4.setText(k96.M0(2131749254, null));
                            }
                        } else if (i == 0) {
                            textView4.setText(k96.M0(2131751126, null));
                        } else if (i == 2) {
                            textView4.setText(k96.M0(2131752175, null));
                        } else {
                            textView4.setText(k96.M0(2131749255, null));
                        }
                    } else if (i == 0) {
                        textView4.setText(k96.M0(2131751127, null));
                    } else if (i == 2) {
                        textView4.setText(k96.M0(2131752176, null));
                    } else {
                        textView4.setText(k96.M0(2131749256, null));
                    }
                    if (k96.a0) {
                        m.addView(textView4, nme.o(-2, -2));
                        if (i == 0) {
                            m.addView(imageView, nme.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                        } else if (i == 2) {
                            m.addView(imageView, nme.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                        } else {
                            m.addView(imageView, nme.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                        }
                    } else {
                        if (i == 0) {
                            m.addView(imageView, nme.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                        } else if (i == 2) {
                            m.addView(imageView, nme.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                        } else {
                            m.addView(imageView, nme.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                        }
                        m.addView(textView4, nme.o(-2, -2));
                    }
                    i3++;
                    f = f2;
                }
            }
            i2 = 2131749245;
        }
        tb4.u(15.0f, i2, 1, textView3, null);
        zkb.X(textView3, bkb.Yc, wjbVar);
        arrayList.add(textView3);
        float f3 = 260.0f;
        textView3.setMaxWidth(gl.L(260.0f));
        addView(textView3, nme.t(-2, -2, (i == 2 ? k96.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i == 2 ? 0 : 8));
        i3 = 0;
        while (i3 < 4) {
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i3)).setTextColor(i);
            i3++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((ImageView) arrayList2.get(i2)).setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.Yc, this.a), PorterDuff.Mode.MULTIPLY));
            i2++;
        }
    }
}
