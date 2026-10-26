package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ti0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ vi0 d;

    public ti0(vi0 vi0Var, Context context) {
        this.d = vi0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f == 0) {
            return ((org.telegram.ui.Cells.f5) e1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q;
    }

    @Override // s4.h0
    public final int j(int i10) {
        vi0 vi0Var = this.d;
        if (vi0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == vi0Var.H || i10 == vi0Var.O) {
            return 2;
        }
        if (i10 == vi0Var.K) {
            return 3;
        }
        if (i10 == vi0Var.L) {
            return 4;
        }
        if (i10 == vi0Var.N) {
            return 5;
        }
        if (i10 == vi0Var.P) {
            return 6;
        }
        return i10 == vi0Var.M ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.User user;
        String format;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = e1Var.f;
        View view = e1Var.a;
        int i16 = 3;
        vi0 vi0Var = this.d;
        if (i15 != 0) {
            if (i15 == 1) {
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, this.c, view, null);
                return;
            }
            if (i15 == 2) {
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 == vi0Var.O) {
                    q4Var.setTopMargin(9);
                    q4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    q4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                } else {
                    q4Var.setTopMargin(11);
                    q4Var.setPadding(0, 0, 0, 0);
                    q4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                    return;
                }
            }
            if (i15 == 4) {
                g91 g91Var = (g91) view;
                g91Var.e(vi0Var.r, false);
                g91Var.setLayoutParams(new s4.q0(-1, -2));
                return;
            }
            if (i15 != 5) {
                if (i15 != 7) {
                    return;
                }
                g91 g91Var2 = (g91) view;
                g91Var2.e(vi0Var.s, false);
                g91Var2.setLayoutParams(new s4.q0(-1, -2));
                return;
            }
            ui0 ui0Var = (ui0) view;
            TextView[] textViewArr = ui0Var.a;
            TextView[] textViewArr2 = ui0Var.b;
            vi0 vi0Var2 = ui0Var.c;
            t91 t91Var = vi0Var2.e0;
            MessageObject messageObject = vi0Var2.n;
            if (t91Var != null) {
                i13 = t91Var.d();
                i12 = t91Var.a();
                i14 = t91Var.c();
            } else {
                int i17 = messageObject.isStory() ? messageObject.storyItem.views.views_count : messageObject.messageOwner.views;
                i12 = messageObject.isStory() ? messageObject.storyItem.views.forwards_count : messageObject.messageOwner.forwards;
                if (messageObject.isStory()) {
                    int i18 = messageObject.storyItem.views.reactions_count;
                    i13 = i17;
                    i14 = i18;
                } else if (messageObject.messageOwner.reactions != null) {
                    int i19 = 0;
                    for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                        i19 += messageObject.messageOwner.reactions.results.get(i20).count;
                    }
                    i13 = i17;
                    i14 = i19;
                } else {
                    i13 = i17;
                    i14 = 0;
                }
            }
            textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
            textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
            textViewArr[1].setText(AndroidUtilities.formatWholeNumber(vi0Var2.U, 0));
            textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
            textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            TLRPC.ChatFull chatFull = vi0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - vi0Var2.U), 0));
            textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            ui0Var.a();
            return;
        }
        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
        int i21 = vi0Var.I;
        MessageObject messageObject2 = (i10 < i21 || i10 >= vi0Var.J) ? null : (MessageObject) vi0Var.x.get(i10 - i21);
        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
        if (messageObject2.isStory()) {
            TLObject user2 = DialogObject.isUserDialog(dialogId) ? vi0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : vi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            TL_stories.StoryViews storyViews = messageObject2.storyItem.views;
            f5Var.c(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != vi0Var.J - 1);
            TL_stories.StoryItem storyItem = messageObject2.storyItem;
            xd0 xd0Var = new xd0(i16, this, messageObject2);
            f5Var.r = storyItem;
            f5Var.a.setOnClickListener(xd0Var);
            return;
        }
        f5Var.r = null;
        f5Var.a.setOnClickListener(null);
        if (!DialogObject.isUserDialog(dialogId)) {
            TLRPC.Chat chat = vi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i22 = chat.participants_count;
                if (i22 != 0) {
                    format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i22, new Object[0]), LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]));
                } else {
                    user = chat;
                }
            } else {
                format = LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]);
            }
            str = format;
            user = chat;
            if (user == null) {
                f5Var.c(user, null, str, i10 != vi0Var.J - 1);
                return;
            }
            return;
        }
        user = vi0Var.getMessagesController().getUser(Long.valueOf(dialogId));
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
    @Override // s4.h0
    public final s4.e1 x(
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
