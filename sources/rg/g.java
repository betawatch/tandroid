package rg;

import android.content.Context;
import android.widget.FrameLayout;
import fe.i;
import g7.e6;
import g7.g6;
import gh.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout implements td.b {
    public static final int[] s;
    public final String[] a;
    public final b6 b;
    public final lg.a c;
    public final ig.a d;
    public final j4.c[] e;
    public final i[] f;
    public a h;
    public b n;
    public int r;

    static {
        int i9 = R.drawable.msg_input_attach2;
        int i10 = R.drawable.pagedown;
        s = new int[]{i9, i10, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i10, i10};
    }

    public g(Context context, b6 b6Var, lg.b bVar, ig.a aVar) {
        super(context);
        this.a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new j4.c[7];
        this.f = new i[7];
        this.r = 83;
        this.d = aVar;
        this.c = bVar;
        this.b = b6Var;
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10 = i9 >> 16;
        int i11 = i9 & 65535;
        if (i10 >= 0) {
            j4.c[] cVarArr = this.e;
            if (i10 >= cVarArr.length || cVarArr[i10] == null) {
                return;
            }
            if (i11 == 1 || i11 == 2) {
                a();
            }
        }
    }

    public final void a() {
        int i9 = 0;
        float f10 = 0.0f;
        while (true) {
            j4.c[] cVarArr = this.e;
            if (i9 >= cVarArr.length) {
                return;
            }
            j4.c cVar = cVarArr[i9];
            if (cVar != null) {
                qg.b bVar = (qg.b) cVar.b;
                float f11 = ((td.a) cVar.c).e;
                float f12 = ((td.a) cVar.d).e;
                bVar.setVisibility(f11 > 0.0f ? 0 : 8);
                bVar.setAlpha(f11);
                bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                if (i9 != 0) {
                    bVar.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(80.0f)) - f10);
                }
                f10 += (AndroidUtilities.dp((f12 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f11;
            }
            i9++;
        }
    }

    public final i b(int i9) {
        i[] iVarArr = this.f;
        if (iVarArr[i9] == null) {
            i iVar = new i();
            iVar.a = 0;
            iVar.b = false;
            iVar.c = true;
            iVarArr[i9] = iVar;
        }
        return iVarArr[i9];
    }

    public final void c(int i9, int i10, boolean z10) {
        b(i9).a = i10;
        j4.c cVar = this.e[i9];
        if (cVar != null) {
            ((qg.b) cVar.b).a(i10, z10);
            ((td.a) cVar.d).a(i10 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        j4.c cVar = this.e[1];
        if (cVar != null) {
            ((qg.b) cVar.b).c(z10, true);
        }
    }

    public final void e(int i9, boolean z10, boolean z11) {
        int i10;
        int i11;
        j4.c[] cVarArr = this.e;
        j4.c cVar = cVarArr[i9];
        if (cVar != null || z10) {
            if (cVar == null) {
                int i12 = i9 << 16;
                td.a aVar = new td.a(i12 | 1, this, i9 == 0 ? gr.h : sd.a.a, i9 == 0 ? 300L : 280L, false);
                td.a aVar2 = new td.a(i12 | 2, this, i9 == 0 ? gr.h : sd.a.a, i9 == 0 ? 300L : 280L, false);
                if (i9 == 0) {
                    i10 = 50;
                    i11 = 32;
                } else {
                    i10 = 56;
                    i11 = 48;
                }
                Context context = getContext();
                int i13 = s[i9];
                b6 b6Var = this.b;
                qg.b bVar = new qg.b(context, b6Var);
                qg.a d = qg.a.d(context, this.d, this.c, b6Var, i13, i11);
                bVar.b = d;
                bVar.addView(d, e6.e(i10, i10, 80));
                d.setIconPadding(AndroidUtilities.dp(2.0f));
                g6.b(bVar, 0.13f, 2.0f);
                float f10 = i10 / 2.0f;
                bVar.setPivotX(AndroidUtilities.dp(f10));
                bVar.setPivotY(AndroidUtilities.dp(f10 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.a[i9]);
                bVar.setOnClickListener(new z0(this, i9, 27));
                bVar.setOnLongClickListener(new tl0(this, i9, 1));
                if (i9 == 6) {
                    qg.a aVar3 = bVar.b;
                    aVar3.h = -1.0f;
                    aVar3.a();
                }
                if (i9 == 1) {
                    bVar.d = true;
                    mq mqVar = bVar.c;
                    if (mqVar != null) {
                        mqVar.setReverse(true);
                    }
                }
                addView(bVar, e6.e(i10, i10 + 8, this.r));
                cVarArr[i9] = new j4.c(bVar, aVar, aVar2, false, 28);
                i iVar = this.f[i9];
                if (iVar != null) {
                    bVar.a(iVar.a, false);
                    aVar.a(false, false);
                    aVar2.a(iVar.a > 0, false);
                    bVar.c(iVar.b, false);
                    bVar.b(iVar.c, false);
                }
                a();
            }
            ((td.a) cVarArr[i9].c).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i9) {
        this.r = i9;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.n = bVar;
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
