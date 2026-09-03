package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((w31) this.b).dismiss();
                break;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 2:
                ((g41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        qh.e3 e3Var = secretMediaViewer.r;
                        if (e3Var.S) {
                            e3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                h71 h71Var = (h71) this.b;
                if (h71Var.X instanceof TLRPC.User) {
                    qh.d dVar = h71Var.e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        h71Var.T((TLRPC.User) h71Var.X, null, null);
                        break;
                    }
                }
                break;
            case 5:
                i81.a((i81) this.b);
                break;
            case 6:
                ((zd1) this.b).c(true);
                break;
            case 7:
                ((zd1) ((hg.u) this.b).c).c(true);
                break;
            case 8:
                he1 he1Var = (he1) this.b;
                ArrayList arrayList = he1Var.f;
                HashSet hashSet = he1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = he1Var.getMessagesController().getUser(Long.valueOf(he1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        he1Var.getMessagesController().putChat(chat, false);
                        he1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    he1Var.finishFragment();
                    break;
                }
                break;
            default:
                bj1 bj1Var = (bj1) this.b;
                bj1Var.a.c(!r0.b(), true);
                bj1Var.c.setEnabled(bj1Var.a.b());
                bj1Var.c.animate().alpha(bj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
