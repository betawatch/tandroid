package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qh0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ sh0 d;

    public qh0(sh0 sh0Var, Context context) {
        this.d = sh0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f == 0) {
            return ((org.telegram.ui.Cells.e5) c1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.Q;
    }

    @Override // s4.g0
    public final int d(int i10) {
        sh0 sh0Var = this.d;
        if (sh0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == sh0Var.H || i10 == sh0Var.O) {
            return 2;
        }
        if (i10 == sh0Var.K) {
            return 3;
        }
        if (i10 == sh0Var.L) {
            return 4;
        }
        if (i10 == sh0Var.N) {
            return 5;
        }
        if (i10 == sh0Var.P) {
            return 6;
        }
        return i10 == sh0Var.M ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        String format;
        String str;
        int i11;
        char c10;
        int i12;
        int i13;
        int i14;
        int i15 = c1Var.f;
        View view = c1Var.a;
        sh0 sh0Var = this.d;
        if (i15 != 0) {
            if (i15 == 1) {
                org.telegram.ui.ActionBar.a7.a0(view, this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                return;
            }
            if (i15 == 2) {
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == sh0Var.O) {
                    p4Var.setTopMargin(9);
                    p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
                    p4Var.setText(org.telegram.messenger.cd.a0("StatisticOverview", null, 2131744913, new Object[0]));
                    return;
                } else {
                    p4Var.setTopMargin(11);
                    p4Var.setPadding(0, 0, 0, 0);
                    p4Var.setText(org.telegram.messenger.cd.a0("PublicShares", null, 2131746598, new Object[0]));
                    return;
                }
            }
            if (i15 == 4) {
                e61 e61Var = (e61) view;
                e61Var.e(sh0Var.r, false);
                e61Var.setLayoutParams(new s4.o0(-1, -2));
                return;
            }
            if (i15 != 5) {
                if (i15 != 7) {
                    return;
                }
                e61 e61Var2 = (e61) view;
                e61Var2.e(sh0Var.s, false);
                e61Var2.setLayoutParams(new s4.o0(-1, -2));
                return;
            }
            rh0 rh0Var = (rh0) view;
            TextView[] textViewArr = rh0Var.a;
            TextView[] textViewArr2 = rh0Var.b;
            sh0 sh0Var2 = rh0Var.c;
            r61 r61Var = sh0Var2.e0;
            org.telegram.messenger.jj jjVar = sh0Var2.n;
            if (r61Var != null) {
                i12 = r61Var.d();
                i13 = r61Var.a();
                i14 = r61Var.c();
                c10 = 1;
            } else {
                boolean x42 = jjVar.x4();
                TL_stories.StoryItem storyItem = jjVar.l;
                int i16 = x42 ? storyItem.views.views_count : jjVar.k.views;
                int i17 = jjVar.x4() ? storyItem.views.forwards_count : jjVar.k.forwards;
                if (jjVar.x4()) {
                    i12 = i16;
                    i14 = storyItem.views.reactions_count;
                    c10 = 1;
                } else {
                    c10 = 1;
                    if (jjVar.k.reactions != null) {
                        int i18 = 0;
                        for (int i19 = 0; i19 < jjVar.k.reactions.results.size(); i19++) {
                            i18 += jjVar.k.reactions.results.get(i19).count;
                        }
                        i12 = i16;
                        i14 = i18;
                    } else {
                        i12 = i16;
                        i13 = i17;
                        i14 = 0;
                    }
                }
                i13 = i17;
            }
            textViewArr[0].setText(org.telegram.messenger.i0.o0(i12, 0));
            textViewArr2[0].setText(org.telegram.messenger.cd.L0(2131744911, null));
            textViewArr[c10].setText(org.telegram.messenger.i0.o0(sh0Var2.U, 0));
            textViewArr2[c10].setText(org.telegram.messenger.cd.a0("PublicShares", null, 2131746598, new Object[0]));
            textViewArr[2].setText(org.telegram.messenger.i0.o0(i14, 0));
            textViewArr2[2].setText(org.telegram.messenger.cd.a0("Reactions", null, 2131746402, new Object[0]));
            TLRPC.ChatFull chatFull = sh0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(org.telegram.messenger.i0.o0(Math.max(0, i13 - sh0Var2.U), 0));
            textViewArr2[3].setText(org.telegram.messenger.cd.a0("PrivateShares", null, 2131746759, new Object[0]));
            rh0Var.a();
            return;
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
        int i20 = sh0Var.I;
        org.telegram.messenger.jj jjVar2 = (i10 < i20 || i10 >= sh0Var.J) ? null : (org.telegram.messenger.jj) sh0Var.y.get(i10 - i20);
        TLRPC.Message message = jjVar2.k;
        TL_stories.StoryItem storyItem2 = jjVar2.l;
        long B0 = org.telegram.messenger.jj.B0(message);
        if (jjVar2.x4()) {
            TLObject Z1 = org.telegram.messenger.o5.E(B0) ? sh0Var.getMessagesController().Z1(Long.valueOf(B0)) : sh0Var.getMessagesController().L0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            e5Var.c(Z1, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? org.telegram.messenger.cd.L0(2131748148, null) : org.telegram.messenger.cd.G(i11, "Views", new Object[0]), i10 != sh0Var.J + (-1));
            wu wuVar = new wu(22, this, jjVar2);
            e5Var.r = storyItem2;
            e5Var.a.setOnClickListener(wuVar);
            return;
        }
        e5Var.r = null;
        e5Var.a.setOnClickListener(null);
        if (!org.telegram.messenger.o5.E(B0)) {
            TLRPC.Chat L0 = sh0Var.getMessagesController().L0(Long.valueOf(-B0));
            if (!org.telegram.messenger.w3.T(L0) || L0.megagroup) {
                int i21 = L0.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", org.telegram.messenger.cd.G(i21, "Members", new Object[0]), org.telegram.messenger.cd.G(jjVar2.k.views, "Views", new Object[0]));
                } else {
                    user = L0;
                }
            } else {
                format = org.telegram.messenger.cd.G(jjVar2.k.views, "Views", new Object[0]);
            }
            str = format;
            user = L0;
            if (user == null) {
                e5Var.c(user, null, str, i10 != sh0Var.J + (-1));
                return;
            }
            return;
        }
        user = sh0Var.getMessagesController().Z1(Long.valueOf(B0));
        str = null;
        if (user == null) {
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // s4.g0
    public final s4.c1 w(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
